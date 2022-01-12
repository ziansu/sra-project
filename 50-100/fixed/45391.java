private eu.codlab.markdown.entities.ColorEntity unstackColor() {
    if (((_stack_of_color) != null) && ((_stack_of_color.size()) > 0)) {
        _stack_of_color.remove(0);
        if ((_stack_of_color.size()) > 0) {
            return _stack_of_color.get(0);
        }
    }
    return eu.codlab.markdown.entities.ColorEntity.createDefaultColor();
}