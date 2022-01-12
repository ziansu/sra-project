@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    java.lang.String c_char = s.toString();
    java.lang.CharSequence elem = ".";
    if (c_char.contains(elem)) {
        toPost.put("text", c_char);
        com.helloworld.nicita.nightfox_hw.httpReqHandler hh = new com.helloworld.nicita.nightfox_hw.httpReqHandler(toPost, reqUrl);
        hh.execute();
        t2s_text.setText("");
        while (hh.getProgress()) {
            toPost.put("text", "");
        } 
    }
}