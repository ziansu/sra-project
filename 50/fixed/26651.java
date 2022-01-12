@org.springframework.data.jpa.repository.Query(value = "select new com.softserveinc.edu.boardgames.persistence.entity.dto.GameDetailsDTO" + (("(g.name, 0, 0.0) " + "from Game g ") + "where g.id = :gameId"))
public com.softserveinc.edu.boardgames.persistence.entity.dto.GameDetailsDTO getGameDetails(@org.springframework.data.repository.query.Param(value = "gameId")
java.lang.Integer gameId);