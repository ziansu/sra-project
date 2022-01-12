public java.lang.String generateJS() {
    java.lang.StringBuilder sb = org.shaolin.uimaster.page.DisposableBfString.getBuffer();
    try {
        sb.append("defaultname.").append(this.getId());
        sb.append(" = new ").append(getJsName()).append("('");
        sb.append(this.getId()).append(".\');\n");
        return sb.toString();
    } finally {
        org.shaolin.uimaster.page.DisposableBfString.release(sb);
    }
}