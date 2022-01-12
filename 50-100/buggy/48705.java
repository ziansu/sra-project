public java.util.List<net.sergey.diplom.dto.airfoil.CharacteristicsDto> characteristicsToCharacteristicsDto(java.util.Set<net.sergey.diplom.domain.airfoil.Characteristics> characteristics) {
    java.util.List<net.sergey.diplom.dto.airfoil.CharacteristicsDto> characteristicsDto = new java.util.ArrayList(characteristics.size());
    for (net.sergey.diplom.domain.airfoil.Characteristics coordinate : characteristics) {
        characteristicsDto.add(characteristicsToCharacteristicsDto(coordinate));
    }
    return characteristicsDto;
}