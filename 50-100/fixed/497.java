@java.lang.Override
public void init(android.os.Bundle savedInstanceState) {
    addSlide(com.culture.coffee.coffee_culture.SampleSlide.newInstance(R.layout.first_fragment));
    addSlide(com.culture.coffee.coffee_culture.SampleSlide.newInstance(R.layout.second_fragment));
    addSlide(com.culture.coffee.coffee_culture.SampleSlide.newInstance(R.layout.third_fragment));
    setBarColor(android.graphics.Color.parseColor("#0D0A05"));
    setSeparatorColor(android.graphics.Color.parseColor("#BF944A"));
    showSkipButton(true);
    setProgressButtonEnabled(true);
}