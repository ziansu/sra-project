public static boolean deletePart(model.Part part) {
    return model.Inventory.allParts.remove(part);
}