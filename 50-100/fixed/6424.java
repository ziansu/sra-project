private void createArrayList(java.lang.String jsonString) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    if (jsonString != null) {
        com.example.jim.myapplication.Equipment[] downloadedEquipments = gson.fromJson(jsonString, com.example.jim.myapplication.Equipment[].class);
        for (com.example.jim.myapplication.Equipment equipment : downloadedEquipments) {
            equipmentList.add(equipment);
        }
    }
}