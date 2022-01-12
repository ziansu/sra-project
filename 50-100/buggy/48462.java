public static void ProbGen(int blockSize, int blockID, java.util.Vector<java.lang.Double> ProbVector) throws java.io.IOException {
    Source.mgrScript.exeCreateRScriptFile(blockSize, blockID);
    ExecuteShellComand obj = new ExecuteShellComand();
    java.lang.String[] command = new java.lang.String[]{ "source(\'src\\\\Distribution.R\')" };
    obj.executeCommand(command);
    MngrScript.convertRToArray(ProbVector);
}