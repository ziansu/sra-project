static de.vandermeer.asciiparagraph.AP_Renderer create() {
    return new de.vandermeer.asciiparagraph.AP_Renderer() {
        java.lang.String lineSeparator = null;

        @java.lang.Override
        public java.lang.String getLineSeparator() {
            return this.lineSeparator;
        }

        @java.lang.Override
        public de.vandermeer.asciiparagraph.AP_Renderer setLineSeparator(java.lang.String separator) {
            if (!(org.apache.commons.lang3.StringUtils.isBlank(separator))) {
                this.lineSeparator = separator;
            }
            return this;
        }
    };
}