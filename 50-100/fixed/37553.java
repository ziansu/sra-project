public void setAvroType(java.lang.String avroTypeDesc) {
    for (int i = 0; i < (org.inquidia.kettle.plugins.avrooutput.AvroOutputField.avroDescriptions.length); i++) {
        if (avroTypeDesc.equalsIgnoreCase(org.inquidia.kettle.plugins.avrooutput.AvroOutputField.avroDescriptions[i])) {
            this.avroType = i;
            break;
        }
    }
    this.avroTypeDesc = null;
}