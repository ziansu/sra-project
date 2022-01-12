@java.lang.Override
public edu.formation.model.Film findById(java.lang.Integer id) {
    if ((id - 1) < (this.films.size())) {
        return this.films.get((id - 1));
    }else {
        return null;
    }
}