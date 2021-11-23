public synchronized void add(java.lang.String m) {
    java.lang.System.out.println(("adding " + m));
    for (char c : m.toCharArray()) {
        if (c != '-')
            this.marble.add(c);
        
    }
    parseLatch.countDown();
}