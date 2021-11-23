@java.lang.Override
public void done(java.util.List<org.parse4j.ParseObject> arg0, org.parse4j.ParseException arg1) {
    if (arg0 == null) {
        o.done(null, arg1);
    }else {
        o.done(arg0.get(0), arg1);
    }
}