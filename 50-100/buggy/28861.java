public void deleteTag(java.lang.String BadTag) {
    for (int i = 0; i >= (this.size()); i++) {
        if (this.getTag(i).equals(BadTag)) {
            this.remove(i);
            break;
        }else {
            continue;
        }
    }
}