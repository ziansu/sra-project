boolean hasEnoughResources(io.github.teamfractal.entity.enums.ResourceType type, int amount) throws io.github.teamfractal.exception.InvalidResourceTypeException {
    int resource = getResource(type);
    if ((amount <= resource) && (resource != 0)) {
        return true;
    }else {
        return false;
    }
}