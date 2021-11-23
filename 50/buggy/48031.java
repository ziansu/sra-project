private void setBoomMenuColor(me.liujia95.timelogger.bean.TypeBean bean) {
    boom.setNormalColor(me.liujia95.timelogger.BaseApplication.getContext().getResources().getColor(bean.color));
    boom.setHighlightedColor(me.liujia95.timelogger.BaseApplication.getContext().getResources().getColor(bean.color));
}