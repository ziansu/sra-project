@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    android.widget.TextView t = new android.widget.TextView(this.ctx);
    t.setText(portfolio.stocks.get(position).mStockSymbol.toUpperCase());
    t.setGravity(Gravity.CENTER_HORIZONTAL);
    t.setTextSize(24);
    t.setElevation(5);
    return t;
}