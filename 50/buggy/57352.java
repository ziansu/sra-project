public void setDescription(java.lang.String content) {
    if (((description) != null) && (description.equals(content)))
        return ;
    
    description = content;
    notifyPropertyChanged();
}