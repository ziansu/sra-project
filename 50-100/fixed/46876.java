public static vn.tuan.app.model.Word parse(java.lang.String[] record) {
    return new vn.tuan.app.model.Word(record[0], record[1], vn.tuan.app.model.WordType.valueOf(record[2])).setExample(((record.length) > 3 ? record[3] : null));
}