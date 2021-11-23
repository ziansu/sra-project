private void highlightAllOrNext() {
    if (_highlightsButton.isSelected()) {
        _previousCursor = _searchable.getCurrentIndex();
        highlightAll();
    }else {
        if ((_previousCursor) >= 0) {
            _searchable.setCursor(_previousCursor);
            _searchable.setSelectedIndex(_previousCursor, false);
        }
        highlightNext();
    }
}