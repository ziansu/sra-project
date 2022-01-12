public void end(MyWorld mw) throws java.lang.Exception {
    JSONObject msg = new JSONObject(getResult().getText());
    mw.setState(3);
    java.lang.System.out.println(msg.get("winner").toString());
    if (msg.get("winner").toString().equals(mw.getNum())) {
        mw.win();
    }else {
        mw.fail();
    }
}