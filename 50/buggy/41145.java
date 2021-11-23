public void removePart(org.openpnp.model.Part part) {
    parts.remove(part.getId());
    firePropertyChange("parts", null, parts);
}