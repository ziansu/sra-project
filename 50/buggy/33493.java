public fiftyone.mobile.detection.entities.Value get(int index) {
    if (index > (values.length)) {
        return null;
    }
    return values[index];
}