@java.lang.Override
public java.util.Iterator<java.lang.String> iterator() {
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