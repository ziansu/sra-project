private java.lang.String getRemoveSql() {
    java.lang.String sql = (((((((((((("\t\tfunction remove" + (this.nom)) + "($id) {\n") + "\t\t\t$sql=\'DELETE FROM ") + (this.nom)) + " WHERE id=\' . $this->dbh->quote($id) . \')\';\n") + "\t\t\ttry {\n") + "\t\t\t\t$this->dbh->exec($sql);\n") + "\t\t\t} catch (PDOException $e) {\n") + "\t\t\t\techo \'Problem in remove") + (this.nom)) + "() : \\n\' . $e->getMessage();\n") + "\t\t\t}\n") + "\t\t}\n\n";
    return sql;
}