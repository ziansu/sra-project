private java.util.ArrayList<ua.gnatyuk.sweethome.model.dto.TemperatureDTO> trimDataPerMonth(java.util.ArrayList<ua.gnatyuk.sweethome.model.dto.TemperatureDTO> data) {
    java.util.ArrayList<ua.gnatyuk.sweethome.model.dto.TemperatureDTO> temp = new java.util.ArrayList<>();
    for (int i = 0; i < (data.size()); i++) {
        if ((i % 20) == 0) {
            temp.add(data.get(i));
        }
    }
    return temp;
}