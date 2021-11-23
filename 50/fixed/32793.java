@java.lang.Override
public java.lang.String[] convertToEntityAttribute(java.lang.String jobDesc) {
    if (jobDesc.isEmpty())
        return null;
    
    return jobDesc.substring(1, ((jobDesc.length()) - 1)).split(", ");
}