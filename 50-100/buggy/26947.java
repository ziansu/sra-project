public static java.util.ArrayList<com.emrahdayioglu.dalnoboishik.bean.ItemBean> convertJsonArrayOfItemsToList(org.json.JSONArray jsonArray) {
    java.util.ArrayList<com.emrahdayioglu.dalnoboishik.bean.ItemBean> items = new java.util.ArrayList<>();
    try {
        for (int i = 0; i < (jsonArray.length()); i++) {
            com.emrahdayioglu.dalnoboishik.bean.ItemBean item = com.emrahdayioglu.dalnoboishik.utils.Util.convertJsonObjectOfItem(jsonArray.getJSONObject(i));
            items.add(item);
        }
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return items;
}