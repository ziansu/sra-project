private void multiSelect(br.com.mvbos.jeg.element.ElementModel el) {
    for (int i = 0; i < (selectedElements.length); i++) {
        if ((selectedElements[i]) == el) {
            break;
        }
        if ((selectedElements[i]) != null) {
            continue;
        }
        selectedElements[i] = el;
        break;
    }
}