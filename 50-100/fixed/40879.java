@java.lang.Override
public boolean equals(java.lang.Object other) {
    if (other instanceof co.shinetech.dto.Profile) {
        co.shinetech.dto.Profile p = ((co.shinetech.dto.Profile) (other));
        return ((this.id) == (p.getPk())) && (this.name.equals(p.getName()));
    }
    return false;
}