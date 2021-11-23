public java.io.Writer getWriter() throws java.io.IOException {
    return new java.io.StringWriter() {
        @java.lang.Override
        public void flush() {
            com.cwctravel.hudson.plugins.multimoduletests.junit.io.StringReaderWriter.this.data = toString();
        }

        @java.lang.Override
        public void close() {
            com.cwctravel.hudson.plugins.multimoduletests.junit.io.StringReaderWriter.this.data = toString();
        }
    };
}