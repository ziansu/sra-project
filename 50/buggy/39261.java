@java.lang.Override
public void setConverter(to.etc.domui.converter.IConverter<T> converter) {
    m_converter = converter;
    if (((m_numberMode) != (to.etc.domui.component.input.Text.NumberMode.NONE)) && (converter != null)) {
        m_numberMode = to.etc.domui.component.input.Text.NumberMode.NONE;
        to.etc.domui.component.input.Text.setOnKeyPressJS(null);
    }
}