@org.junit.Test
public void testL2LossModel() throws java.lang.Exception {
    edu.illinois.cs.cogcomp.sl.core.SLParameters para = new edu.illinois.cs.cogcomp.sl.core.SLParameters();
    para.LEARNING_MODEL = edu.illinois.cs.cogcomp.sl.core.SLParameters.LearningModelType.L2LossSSVM;
    para.L2_LOSS_SSVM_SOLVER_TYPE = SolverType.DCDSolver;
    para.TRAINMINI = true;
    para.MAX_NUM_ITER = 1000;
    para.STOP_CONDITION = 0.01F;
    para.C_FOR_STRUCTURE = 0.01F;
    para.INNER_STOP_CONDITION = 0.01F;
    testModel(para, 1.0F, 12.26F);
    para.L2_LOSS_SSVM_SOLVER_TYPE = SolverType.ParallelDCDSolver;
    testModel(para, 1.0F, 12.26F);
    para.L2_LOSS_SSVM_SOLVER_TYPE = SolverType.DEMIParallelDCDSolver;
    para.MAX_NUM_ITER = 10000;
    para.STOP_CONDITION = 0.001F;
    para.DEMIDCD_NUMBER_OF_UPDATES_BEFORE_UPDATE_BUFFER = 1;
    para.DEMIDCD_NUMBER_OF_INF_PARSE_BEFORE_UPDATE_WV = 1;
    para.PROGRESS_REPORT_ITER = 500;
    testModel(para, 1.0F, 12.26F);
}