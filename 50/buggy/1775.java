@java.lang.Override
public void decorate(com.prolificinteractive.materialcalendarview.DayViewFacade view) {
    view.addSpan(new android.text.style.StyleSpan(android.graphics.Typeface.BOLD));
    view.addSpan(new android.text.style.RelativeSizeSpan(1.5F));
    view.setBackgroundDrawable(drawable);
    view.setDaysDisabled(true);
}