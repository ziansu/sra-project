@java.lang.Override
public com.mycompany.pokdedex.db.dto.PokemonAttackDto map(int i, java.sql.ResultSet resultSet, org.skife.jdbi.v2.StatementContext statementContext) throws java.sql.SQLException {
    com.mycompany.pokdedex.db.dto.PokemonAttackDto pokemonAttackDto = new com.mycompany.pokdedex.db.dto.PokemonAttackDto();
    pokemonAttackDto.setPokemonId(resultSet.getInt("pokemon_id"));
    pokemonAttackDto.setAttackId(resultSet.getInt("attack_id"));
    return pokemonAttackDto;
}