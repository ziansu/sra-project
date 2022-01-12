public void showError(int code, java.lang.String str) {
    java.lang.String message = "";
    switch (code) {
        case 1 :
            message = "零不能作除数";
            break;
        case 2 :
            message = "函数格式错误";
            break;
        case 3 :
            message = "值太大了，超出范围";
    }
    input.setText((((("\"" + str) + "\"") + ": ") + message));
    tip.setText(((message + "\n") + "计算完毕，要继续请按归零键 C"));
}