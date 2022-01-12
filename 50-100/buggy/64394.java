@java.lang.Override
public java.util.Iterator<java.lang.String> iterator() {
    final com.tcdi.zombodb.query_parser.EscapingStringTokenizer st = new com.tcdi.zombodb.query_parser.EscapingStringTokenizer(arrayData.get(node.value.toString()).toString(), ", \r\n\t\f\"\'[]");
    return new java.util.Iterator<java.lang.String>() {
        @java.lang.Override
        public boolean hasNext() {
            return st.hasMoreTokens();
        }

        @java.lang.Override
        public java.lang.String next() {
            return st.nextToken();
        }

        @java.lang.Override
        public void remove() {
        }
    };
}