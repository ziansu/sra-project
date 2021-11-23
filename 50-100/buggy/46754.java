public java.lang.String getSecuritiesString() {
    java.lang.String result = "";
    for (java.util.Map.Entry<main.ru.konstpavlov.utils.SecurityType, java.lang.Integer> entry : securities.entrySet()) {
        result = (result + (entry.getValue().toString())) + "\t";
    }
    result = result.substring(0, ((result.length()) - 2));
    return result;
}