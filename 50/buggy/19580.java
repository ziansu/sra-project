public void setNew(java.lang.String token) {
    this.txtToken.setText(token);
    this.txtToken.setVisible(true);
    this.txtInfo.setText(messages.getString("tokenInfo"));
    this.lblGif.setIcon(gifServer);
}