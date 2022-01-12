public static java.lang.String getBarcode() {
    if (Garage.CodeGenerator.availableBarcodes.isEmpty()) {
        (Garage.CodeGenerator.barcodeCounter)++;
        java.lang.String barcode = java.lang.String.format("%05d", Garage.CodeGenerator.barcodeCounter);
        while (Garage.CodeGenerator.takenBarcodes.contains(barcode)) {
            (Garage.CodeGenerator.barcodeCounter)++;
        } 
        Garage.CodeGenerator.takenBarcodes.add(barcode);
        return barcode;
    }else
        return java.lang.String.format("%05d", java.lang.Integer.parseInt(Garage.CodeGenerator.availableBarcodes.pop()));
    
}