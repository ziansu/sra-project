public java.lang.String getRankName() {
    if ((detail.Type) == 0) {
        return "隐藏";
    }else {
        return java.lang.String.valueOf(((detail.Rank) + 1));
    }
}