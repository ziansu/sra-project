@com.taobao.weex.ui.component.WXComponentProp(name = Constant.Name.FILL_COLOR)
public void setFillColor(java.lang.String param) {
    mFillColor = android.graphics.Color.parseColor(param);
    mPolygon.setFillColor(mFillColor);
}