public void onStart() {
    super.onStart();
    android.os.Bundle bun = getArguments();
    type = bun.getInt("type");
    setLabel(bun.getString("lbl"));
    setHost(bun.getString("host"));
    setPort(bun.getString("port"));
    setUsername(bun.getByteArray("uname"));
    setPassword(bun.getByteArray("pass"));
}