@java.lang.Override
protected void putWidget(ru.tehkode.spout.layout.Widget widget, ru.tehkode.spout.layout.Widget child) {
    ((ru.tehkode.spout.layout.PopupScreen) (widget)).attachWidget(this.plugin, widget);
}