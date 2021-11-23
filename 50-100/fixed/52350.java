public void end(MyWorld mw, JSONObject msg) throws java.lang.Exception {
    mw.setState(3);
    java.lang.System.out.println(msg.get("winner").toString());
    if (msg.get("winner").toString().equals(mw.getNum())) {
        mw.win();
    }else {
        mw.fail();
    }
}