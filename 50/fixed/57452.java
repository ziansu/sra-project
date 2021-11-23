private void updateCountLabels() {
    synchronized(buttons) {
        for (us.mn.state.dot.tms.client.proxy.StyleSummary.StyleButton btn : buttons) {
            btn.setText((((java.lang.Integer.toString(btn.n_count)) + ' ') + (btn.i_style)));
        }
    }
}