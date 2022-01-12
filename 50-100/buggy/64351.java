public void setPercent(double percent) {
    this.percent = percent;
    if (percent < 100) {
        div.getElement().getStyle().setWidth(percent, Unit.PCT);
    }else {
        com.google.gwt.core.client.GWT.log("Progress percent must not exceed to 100 percent.", new java.lang.RuntimeException());
    }
}