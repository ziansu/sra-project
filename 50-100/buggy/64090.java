public adventure.Item isRecipe(adventure.Item[] in) {
    adventure.Item toReturn = null;
    for (adventure.Recipe r : adventure.Recipe.recipes) {
        if ((in.length) == (r.input.length)) {
            if (sameElements(in, r.input)) {
                toReturn = r.output;
                break;
            }
        }
    }
    return toReturn;
}