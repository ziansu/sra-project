private void updateLength() {
    int newLength = 0;
    for (net.decix.jipfix.header.TemplateRecord template : templateRecords) {
        newLength += template.getLength();
    }
    for (net.decix.jipfix.header.OptionTemplateRecord optionTemplate : optionTemplateRecords) {
        newLength += optionTemplate.getLength();
    }
    for (net.decix.jipfix.header.DataRecord record : dataRecords) {
        newLength = record.getLength();
    }
    this.length = newLength + (net.decix.jipfix.header.SetHeader.HEADERLENGTH);
}