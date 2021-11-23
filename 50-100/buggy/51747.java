@java.lang.Override
public void done(java.util.List<org.parse4j.ParseObject> arg0, org.parse4j.ParseException arg1) {
    if ((arg1 != null) || (arg0.isEmpty()))
        o.done(null, arg1);
    
    o.done(arg0.get(0), null);
}