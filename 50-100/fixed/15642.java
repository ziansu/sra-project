void init(com.oracle.bedrock.runtime.java.container.Scope scope) {
    m_outputWriter = new java.io.PrintWriter(scope.getStandardOutput()) {
        @java.lang.Override
        public void close() {
        }
    };
    m_errorWriter = new java.io.PrintWriter(scope.getStandardError()) {
        @java.lang.Override
        public void close() {
        }
    };
    m_inputReader = new java.io.InputStreamReader(scope.getStandardInput()) {
        @java.lang.Override
        public void close() throws java.io.IOException {
        }
    };
}