public void end(org.imdea.vcd.datum.Proto.MessageSet.Status status, java.lang.Long start) {
    java.lang.Long time = (java.lang.System.nanoTime()) - start;
    switch (status) {
        case COMMITTED :
            COMMITTED_TIMES.add(time);
            break;
        case DELIVERED :
            DELIVERED_TIMES.add(time);
            break;
    }
}