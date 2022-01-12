@java.lang.Override
public ru.kolaer.permit.dto.Page<ru.kolaer.permit.entity.RoleEntity> getAll(@lombok.NonNull
java.lang.Integer number, @lombok.NonNull
java.lang.Integer pageSize, java.lang.Integer sort) {
    return this.dao.findAll(number, pageSize, true, sort);
}