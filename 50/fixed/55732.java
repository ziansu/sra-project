private void setFlag() {
    android.widget.ImageView flag = ((android.widget.ImageView) (findViewById(R.id.flag)));
    if (language.equals("nl")) {
        flag.setImageResource(R.drawable.dutchflag);
    }else {
        flag.setImageResource(R.drawable.englishflag);
    }
}