private void configureSolver() {
    this.setSearchListener(new org.sat4j.tools.SearchListenerAdapter<org.sat4j.pb.IPBSolverService>() {
        private static final long serialVersionUID = 1L;

        @java.lang.Override
        public void conflictFound(org.sat4j.specs.IConstr confl, int dlevel, int trailLevel) {
            handleConflict(confl);
        }
    });
}