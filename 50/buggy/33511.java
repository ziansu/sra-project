@java.lang.Override
public ru.yandex.yamblz.ui.fragments.brush.Brush copy() {
    ru.yandex.yamblz.ui.fragments.brush.DrawableBrush brush = new ru.yandex.yamblz.ui.fragments.brush.DrawableBrush(drawable, id);
    return copy(brush);
}